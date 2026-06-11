package com.softserve.academy.module4.enums;

public enum Season {
        //WINTER, SPRING, SUMMER, AUTUMN
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }
    public String getSeasonName() {
        return seasonName;
    }
    public Season getNextSeason() {
        return switch (this) {
            case WINTER -> SPRING;
            case SPRING -> SUMMER;
            case SUMMER -> AUTUMN;
            case AUTUMN -> WINTER;
            default -> throw new IllegalStateException("Unexpected value: " + this);
        };
    }
}

class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println("Season name: " + season.getSeasonName());
        Season season2 = Season.WINTER;
        System.out.println("Next season after " + season2.getSeasonName() + " is " + season2.getNextSeason().getSeasonName());
//        System.out.println(season);
//        System.out.println(season2);
    }
}
