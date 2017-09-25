import com.mmikhail.groovy.service.Sayhello_ptt;
import oracle.integration.platform.blocks.java.beans.impl.LoggerBean;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component class gbean implements Sayhello_ptt{
	@Autowired
	def LoggerBean logger;
  String execute(String request) {
        logger.log(Level.INFO,"GROOVY REQUEST: "+request);
        return "My the groovy be with you, "+request+"!"
    }   
}

