public class ExcludePop implements GenreFilter {
    @Override
    public boolean permit(Album album) {

        return album.getGenre() != Album.Genre.POP;
    }
}
