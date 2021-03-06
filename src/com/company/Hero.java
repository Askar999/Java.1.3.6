package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superpower;


    public Hero(int health, int damage, String superpower){
        this.health=health;
        this.damage=damage;
        this.superpower=superpower;
    }


    public int getHealth() {
        return health;}

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public String getSuperpower() {
        return superpower;
    }

    public int getDamage() {
        return damage;
    }
}

/*ДЗ:
● Создать класс Героя (Hero), с приватными полями здоровье, урон и
суперспособность. Написать 2 разных конструктора для создания объекта. В одном
конструкторе задаются все поля, в другом только здоровье и урон. Добавить в
класс Hero геттеры для всех полей.
● Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.
● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
полям). Затем распечатать всю информацию о боссе.

ДЗ на сообразительность:
● Добавить метод в классе Main который называется createHeroes, в теле метода
необходимо создать 3х героев с помощью класса Hero, используя при этом разные
варианты конструкторов (либо первый либо второй). Затем поместить созданные
экземпляры героев в массив и вернуть его с помощью команды return, как
возвращаемый результат метода createHeroes. Hero[]
● Затем вызвать этот метод в методе main и распечатать информацию о всех героях
массива через цикл.*/