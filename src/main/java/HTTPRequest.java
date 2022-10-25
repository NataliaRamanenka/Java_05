public class HTTPRequest {
    /* Следуя инструкциям с урока (вкладка Network in Chome DevTools) изучите response с 8-дневным прогнозом погоды
     * и поймите, откуда берутся какие данные в интерфейсе
     * На сайте openWeather.com найдите в документации названия городов на языках, которые поддерживаются в запросах
     * (geocoding https://openweathermap.org/api/geocoding-api). Найдите и скопируйте, как называется город Лондон на языках
     * Greek
     * Persian (Farsi)
     * Hindi
     * French
     * English
     * В классе HTTPRequest:
     * Создать переменные типа String с названиями города Лондон на перечисленных выше языках.
     * Создать метод createRequest(), который принимает на вход параметры:String cityName,String apiKey
     * Метод возвращает строку запроса по названию города (шаблон запроса нужно взять в документации),
     * вставляя необходимые параметры в шаблон (https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key})
     * Метод так же печатает созданные запросы на разных языках.
     * Скопируйте полученные строки запросов, сделайте запросы в браузере, и сравните ответы, совпадают ли они или нет.
     */

    public String createRequest(String cityName, String apiKey) {
        String lang = "";
        if (cityName.equals("Λονδίνο")){
            lang = "&lang=el";
        } else if(cityName.equals("لندن")){
            lang = "&lang=fa";
        } else if(cityName.equals("लंदन")){
            lang = "&lang=hi";
        } else if(cityName.equals("Londres")){
            lang = "&lang=fr";
        } else if(cityName.equals("London")){
            lang = "&lang=en";
        }
        System.out.println("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + lang + "&appid=" + apiKey);

        return "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + lang + "&appid=" + apiKey;
    }

    public static void main(String[] args) {
        String greekLondonName = "Λονδίνο";
        String farsiLondonName = "لندن";
        String hindiLondonName = "लंदन";
        String frenchLondonName = "Londres";
        String englishLondonName = "London";

        String apiKey = "6384a51bd0b6c649e55f8b598b308b3b";

        String greek = new HTTPRequest().createRequest(greekLondonName, apiKey);
        String farsi = new HTTPRequest().createRequest(farsiLondonName, apiKey);
        String hindi = new HTTPRequest().createRequest(hindiLondonName, apiKey);
        String french = new HTTPRequest().createRequest(frenchLondonName, apiKey);
        String english = new HTTPRequest().createRequest(englishLondonName, apiKey);
    }


}
