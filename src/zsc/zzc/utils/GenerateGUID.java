package zsc.zzc.utils;

import java.util.UUID;

public class GenerateGUID {

	public static final String generateGUID(){
		UUID uuid=UUID.randomUUID();
		return uuid.toString();
	}
}
