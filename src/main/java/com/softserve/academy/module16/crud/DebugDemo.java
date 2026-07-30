package com.softserve.academy.module16.crud;

/**
 * Демонстраційний приклад CRUD для теми "Дебагінг".
 * StudentRepository.deleteByName(String) містить навмисну помилку —
 * дивіться коментар над цим методом і пройдіть його дебагером.
 */
public class DebugDemo {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();

        repository.create(new Student(1, "Ivan"));
        repository.create(new Student(2, "Ivan"));
        repository.create(new Student(3, "Olena"));
        repository.create(new Student(4, "Petro"));
        System.out.println("Створено: " + repository.findAll());

        repository.update(3, "Oleh");
        System.out.println("Після update: " + repository.findAll());

        try {
            repository.update(99, "Unknown");
        } catch (Exception e) {
            System.out.println("Очікувана помилка: " + e.getMessage());
        }

        repository.deleteByName("Ivan");
        System.out.println("Після delete (мало би не бути жодного Ivan): " + repository.findAll());
    }
}
