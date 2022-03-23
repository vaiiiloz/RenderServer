package Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("file:InferenceProp.properties")
@Component
@Qualifier("appfileConfig")
public class AppfileConfig {

    @Value("${controllerServicePort}")
    public int controllerServicePort;


    @Value("${mongoServicePort}")
    public int mongoServicePort;

    @Value("${heatmapServicePort}")
    public int heatmapServicePort;

    @Value("${host}")
    public String host;

    @Value("${mongo.address}")
    public String mongoAddress;

    @Value("${mongo.port}")
    public int mongoPort;

    @Value("${mongo.user}")
    public String mongUser;

    @Value("${mongo.pass}")
    public String mongoPass;

    @Value("${mongo.database}")
    public String mongoDatabase;

    @Value("${mongo.box_collection}")
    public String boxCollection;

    @Value("${model.type}")
    public String modelType;

    @Value("${multiplier}")
    public float multiplier;

    @Value("${cephAccessKey}")
    public String cephAccessKey;

    @Value("${cephPrivateKey}")
    public String cephPrivateKey;

    @Value("${cephHostname}")
    public String cephHostname;

    @Value("${mongo.background_collection}")
    public String backgroundCollection;

    @Value("${mongo.track_collection}")
    public String trackCollection;
}
