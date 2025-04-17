public class Computer {
    public int brightness;
    public int volume;

    public void setBrightness(int inputBrightness) {
        this.brightness = inputBrightness;
    }

    public void setVolume(int inputVolume) {
        this.volume = inputVolume;
    }

    public void resetSettings() {
        this.setBrightness(0);
        this.setVolume(0);
    }
}
