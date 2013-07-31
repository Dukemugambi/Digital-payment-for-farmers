package models;

import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.event.ServerConfigStartup;
import com.typesafe.config.ConfigFactory;

import com.wepay.WePay;

import controllers.Application;

public class MyServerConfigStartup implements ServerConfigStartup {
    @Override
    public void onStart(ServerConfig serverConfig) {
		Long appClientId = ConfigFactory.load().getLong("APP_CLIENT_ID");
		String appClientSecret = ConfigFactory.load().getString("APP_CLIENT_SECRET");
		Boolean useStageEnv = ConfigFactory.load().getBoolean("USE_STAGE_ENV");
		initializeWePayObject(appClientId, appClientSecret, useStageEnv);
        serverConfig.setDatabaseSequenceBatchSize(1);
    }
    
	public static void initializeWePayObject(Long appClientId, String appClientSecret, boolean useStageEnv) {
		Application.wepay = new WePay();
		Application.wepay.initialize(appClientId, appClientSecret, useStageEnv);
	}

}
