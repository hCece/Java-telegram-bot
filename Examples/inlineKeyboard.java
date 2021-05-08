import java.util.HashMap;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		TelegramBot telegramBot = new TelegramBot("INSERT_TOKEN");
		
	    String message = "choose your favorite country:";
	    HashMap<String, String> country = new HashMap<>();
	    
	    country.put("England", "_E");
	    country.put("Germany", "_G");
	    country.put("Norway", "_N");
	    country.put("USA", "_U");

	    telegramBot.SendInlineKeyboard("INSERT_ID_TELEGRAM", country, message);
	}
}
