public interface MediaPlayer {
    void play(String trackname);
    void pause();
    String getCurrentTrack();
}

class AudioPlayer implements MediaPlayer {
    private String currentTrack;
    private boolean isPlaying;

    @Override
    public void play(String trackname) {
        this.currentTrack=trackname;
        this.isPlaying=true;
        System.out.println(trackname);
    }

    @Override
    public void pause() {
        if (isPlaying) {
            isPlaying=false;
            System.out.println("Zatrzymano: "+currentTrack);
        }else {
            System.out.println("Już zatrzymano");
        }
    }

    @Override
    public String getCurrentTrack() {
        return currentTrack != null ? "Utwór: "+currentTrack : "Brak utworu";
    }

}
