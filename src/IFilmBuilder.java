public interface IFilmBuilder {
    Films.FilmBuilder addOptions(EUserRoles roles);

    Films.FilmBuilder estConstruit();

    Films build();
}
