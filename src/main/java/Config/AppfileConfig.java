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

    @Value("${mongo.collection}")
    public String mongoCollection;

    @Value("${model.type}")
    public String modelType;

    @Value("${multiplier}")
    public float multiplier;
}
