# api-автотесты

Автотесты для https://petstore.swagger.io/v2.
Для тестирования выбран блок User.
<br>
Использован язык java в сборке maven c подключенными фреймворками junit, restAssured и allure. Отчеты allure генерируются с помощью плагина для maven.
<br>
Расположение тестов: src/test/java. 
<br>
# Задание
Написать API - автотесты для сайта https://petstore.swagger.io/ по одному методу из любых блоков (GET,PUT,POST,DELETE). 
# Инструкция для запуска тестов
1. Открыть проект в IDE
2. Запустить тесты с помощью: mvn clean test
4. Создать отчет, который откроется в браузере: mvn allure:serve


