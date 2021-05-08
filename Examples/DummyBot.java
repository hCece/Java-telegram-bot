public class DummyBot{
	public static void main(String[] args) throws InterruptedException {
		TelegramBot telegramBot = new TelegramBot("INSERT_TOKEN");
		String[] data = new String[2];
		while(true) {
			data = telegramBot.getMessage();
			if(data != null)
				telegramBot.sendMessage(data[0], data[1], false);
			else
				Thread.sleep(500);
		}
			
	}
}