# «Объектно-ориентированное программирование и проектирование»

## Решения
### Задание 1
* <a href="https://github.com/Nephedov/10.11.Java/blob/main/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a> - класс описывающий логику работы с "радиостанциями".
* <a href="https://github.com/Nephedov/10.11.Java/blob/main/src/test/java/ru/netology/Radio/RadioTest.java">RadioTest.java</a> - автотесты.

Ветка <a href="https://github.com/Nephedov/10.11.Java/tree/main">main</a> с проектом.
### Задание 2
* <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a> - с добавленными методами по новым требованиям.
* <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/src/test/java/ru/netology/Radio/RadioTest.java">RadioTest.java</a> - с дополнительными автотестами.
* <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/pom.xml">pom.xml</a> - изменено на 100% покрытие строк JaCoCo.

Ветка <a href="https://github.com/Nephedov/10.11.Java/tree/flexible">flexible</a> с проектом.
### Задание 3
* <a href="https://github.com/Nephedov/10.11.Java/blob/lombok/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a> - добавлены аннотации Lombok.
* <a href="https://github.com/Nephedov/10.11.Java/blob/lombok/pom.xml">pom.xml</a> - добавлен Lombok.

Ветка <a href="https://github.com/Nephedov/10.11.Java/tree/lombok">lombok</a> с проектом.
## Что было сделано
### Задание 1
* Создан Maven проект и настроен <a href="https://github.com/Nephedov/10.11.Java/blob/main/pom.xml">pom.xml</a> c плагинами и зависимостями:
  * JunitJupiter.
  * MavenSurefirePlugin.
  * JaCoCo.
* Настроен <a href="https://github.com/Nephedov/10.11.Java/blob/main/.github/workflows/maven.yml">maven.yml</a> для Github CI с verify-сборкой.
* Реализован класс <a href="https://github.com/Nephedov/10.11.Java/blob/main/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a> c логикой взаимодействия с радиостанциями.
* Реализован класс с автотестами <a href="https://github.com/Nephedov/10.11.Java/blob/main/src/test/java/ru/netology/Radio/RadioTest.java">RadioTest.java</a>
  проверяющий работу класса <a href="https://github.com/Nephedov/10.11.Java/blob/main/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a> на 100% покрытие по бранчам.
### Задание 2
* Создана ветка <a href="https://github.com/Nephedov/10.11.Java/tree/flexible">flexible</a> из ветки <a href="https://github.com/Nephedov/10.11.Java/tree/main">main</a>, в которой:
  * Реализованы дополнительные методы класса <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a>.
  * Реализованы дополнительные автотесты в классе <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/src/test/java/ru/netology/Radio/RadioTest.java">RadioTest.java</a>.
  * Изменены настройки JaCoCo на 100% покрытие строк - <a href="https://github.com/Nephedov/10.11.Java/blob/flexible/pom.xml">pom.xml</a>.
### Задание 3
* Создана ветка <a href="https://github.com/Nephedov/10.11.Java/tree/lombok">lombok</a> из ветки <a href="https://github.com/Nephedov/10.11.Java/tree/flexible">flexible</a> в которой:
  * Добавлена зависимость Lombok в <a href="https://github.com/Nephedov/10.11.Java/blob/lombok/pom.xml">pom.xml</a>.
  * Удалены геттеры/сеттеры, добавлены аннотации Lombok - из <a href="https://github.com/Nephedov/10.11.Java/blob/lombok/src/main/java/ru/netology/Radio/Radio.java">Radio.java</a>.


  # Описание Задания 1. Радиоман (обязательное к выполнению)

В рамках проекта по созданию «Умного дома» у нас появился очень важный клиент, которых хочет кастомную доработку: он очень любит радио, поэтому нам нужно научиться управлять радио.

Требования к работе с радиостанциями:
1. Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
1. Если текущая радиостанция — 9 и клиент нажал на кнопку `next` (=вызвал одноимённый метод `next`, с англ. — следующая) на пульте, то текущей должна стать нулевая. В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
1. Если текущая радиостанция — 0 и клиент нажал на кнопку `prev` (=вызвал одноимённый метод `prev`, с англ. — предыдущая) на пульте, то текущей должна стать девятая. В остальных случаях радио переключается просто на предыдущую станцию.
1. Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера. Для этого подойдёт один метод-сеттер с проверкой на допустимость номера станции.

Требования к работе с уровнем громкости звука:
1. Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 10.
1. Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на `+` (=вызов метода увеличения громкости на один, придумайте название сами) не должно ни к чему приводить.
1. Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на `-` (=вызов метода уменьшения громкости на один, придумайте название сами) не должно ни к чему приводить.

К созданному классу `Radio` напишите тесты, добейтесь покрытия на 100% по бранчам, обрушать сборку по покрытию при этом не нужно. Для хорошего тестирования рекомендуем вам провести тест-дизайн перед написанием тестов, так вы с большей вероятностью найдёте дефекты в вашем коде.

# Описание Задания 2. Радиоман (обязательное к выполнению)

Проект «Умный дом» развивается, и было решено улучшить часть, отвечающую за радио.

Что нужно сделать: внедрить изменения в сам класс и тесты.

Требования к работе с радиостанциями:

1. Можно задавать **количество радиостанций** при создании объекта, по умолчанию — 10.
1. Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций не включительно. То есть если станций 10, то номер последней — 9.
1. Если текущая радиостанция — максимальная, и клиент нажал на кнопку next, следующая, на пульте, то текущей должна стать нулевая.
1. Если текущая радиостанция — 0, и клиент нажал на кнопку prev, предыдущая, на пульте, то текущей должна стать максимальная.
1. Всё так же должен присутствовать сеттер текущей станции.

Теперь объекты радио в своём поле будут хранить и количество станций, заданное при создании объекта радио. Для этого вам понадобится создать свой конструктор для класса `Radio` с одним параметром, принимающий им желаемое количество радиостанций и сохраняющий это значение у себя в поле. Ещё один конструктор потребуется без параметров, чтобы, если пользователь нашего класса не захотел указывать количество радиостанций, мы бы выставили их количество в 10 штук, как указано в требованиях, «по умолчанию — 10».

Внимание: конструктором с параметром задаётся именно количество радиостанций, а не номер максимальной, это разные вещи — если количество станций, например, 30, то последней будет номер 29, так как нумеруем мы с нуля.

Требования к работе с уровнем громкости звука:

* клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100;
* если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить;
* если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить.

# Описание Задания 3*. Lombok (необязательная задача)

Пришла пора разобраться с [Lombok](https://projectlombok.org). В вашем личном кабинете прикреплено видео, где демонстрируется работа с Lombok.

Что нужно сделать:
1. Из ветки `flexible`, созданной в предыдущем задании, создайте ветку `lombok`, в которой перепишите ваш класс `Radio`, используя Lombok.
