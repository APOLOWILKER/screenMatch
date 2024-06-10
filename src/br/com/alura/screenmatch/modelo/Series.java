package br.com.alura.screenmatch.modelo;

public class Series extends Title{
    private int seasons;
    private boolean isLauch;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isLauch() {
        return isLauch;
    }

    public void setLauch(boolean lauch) {
        isLauch = lauch;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    // sobrescrevendo metodo. Ajuda a perceber alterações na classe mãe.
    @Override
    public int getMinutesDuration() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
