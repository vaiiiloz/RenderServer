package Ceph;

import Config.AppfileConfig;
import Config.SpringContext;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


public class CephHandler {

    private String accessKey;
    private String secretKey;
    private String hostname;
    private AppfileConfig appfileConfig;

    public CephHandler(String accessKey, String secretKey, String hostname) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.hostname = hostname;
    }

    public CephHandler() {
        appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);
        this.accessKey = appfileConfig.cephAccessKey;
        this.secretKey = appfileConfig.cephPrivateKey;
        this.hostname = appfileConfig.cephHostname;
    }

    public BufferedImage getBackground(String bucket, String key) throws IOException {
        //get s3 stream Input
        S3ObjectInputStream s3is = createConnect().getObject(bucket, key).getObjectContent();

        //convert to ImageStreamInput
        ImageInputStream is = ImageIO.createImageInputStream(s3is);
        //read streamInput
        return ImageIO.read(is);
    }

    private AmazonS3 createConnect() {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        AmazonS3 conn = new AmazonS3Client(credentials);
        conn.setEndpoint(hostname);
        return conn;
    }
}
