# Java-telegram-bot
This jar will provide you with a simple way to access and get data from a telegram bot. <p>

After downloading create a new project and add this library with the org.json library (<href>http://www.java2s.com/Code/Jar/o/Downloadorgjsonjar.htm</href>)

for now it reads/writes telegram messages, with the option of using inlineKeyboard (https://core.telegram.org/bots/2-0-intro#new-inline-keyboards), but in the near future there might be an update :)


**small doc:** (full doc integrated in the library)
- By creating an object of TelegramBot you are obliged to enter the API of the bot you want to connect.

- getMessage():<p>
  - This methods returns the last unread messages from the object. <p><p>
        
- sendMessage(String idTelegram, String message, boolean setItalicBold):
  - idTelegram: the unique ID connected with the telegram user.
  - message: the text that is being sent to the user.
  - setItalicBold: enable italic (Syntax: \_ITALIC\_) and bold (Syntax: \*BOLD\*)
  

- SendInlineKeyboard(String idTelegram,HashMap<String,String> data, String text):
  - This method uses the inlineKeyboard feature from telegram's API to send buttons to the user.
    - idTelegram: the unique ID connected with the telegram user.
    - data: content in keys will be displayed as button, content in values will be the response from the user pressing a button.
    - text: the initial message to the user.

