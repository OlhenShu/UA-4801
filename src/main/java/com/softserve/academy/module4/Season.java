package com.softserve.academy.module4;

public class Season {
    private String seasonName;

    public static final Season WINTER = new Season("Winter") ;
    public static final Season SPRING = new Season("Spring") ;
    public static final Season SUMMER = new Season("Summer") ;
    public static final Season AUTUMN = new Season("Autumn") ;



    private Season(String seasonName) {
        this.seasonName = seasonName;
    }

    @Override
    public String toString() {
        return seasonName;
    }
}
class SeasonRunner {
    public static void main(String[] args) {
      //Season season = new Season("Summer");
        Season season = Season.SUMMER;
        Season season2 = Season.WINTER;
        System.out.println(season);
      //  Season season2 = new Season("Europe");
        System.out.println(season2);
    }
}