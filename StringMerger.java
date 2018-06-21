import java.util.ArrayList;
import java.util.List;

public static class StringMerger {

    protected int mMaxLength;
    protected char mBgChar;
    protected List<Layer> mLayers;

    public StringMerger() {
        mMaxLength = 30;
        mBgChar = ' '; // a space
        mLayers = new ArrayList<>();
    }

    public StringMerger(int maxLength, char bgChar, List<Layer> layers) {
        mMaxLength = maxLength;
        mBgChar = bgChar;
        mLayers = layers;
    }

    public String getMergedString() {
        char[] chars = new char[mMaxLength];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = mBgChar;
        }

        // int a = 0;
        for (Layer layer : mLayers) {
            if (layer.writeFrom.equals("right")) {
                // Reverse chars
                chars = new StringBuilder(new String(chars)).reverse().toString().toCharArray();
                layer.text = new StringBuilder(layer.text).reverse().toString();
            }

            for (int i = 0; i < chars.length; i++) {
                try {
                    chars[i + layer.start] = layer.text.charAt(i);
                } catch (StringIndexOutOfBoundsException e) {
                    // Do nothing.
                }
            }

            if (layer.writeFrom.equals("right")) {
                // Reverse chars (to normal)
                chars = new StringBuilder(new String(chars)).reverse().toString().toCharArray();
            }
        }

        return new StringBuilder(new String(chars)).toString();
    }

    public static class Layer {

        public String writeFrom;
        public int start;
        public String text;

        public Layer(String writeFrom, int start, String text) {
            this.writeFrom = writeFrom;
            this.start = start;
            this.text = text;
        }
    }

    public int getMaxLength() {
        return mMaxLength;
    }

    public void setMaxLength(int maxLength) {
        mMaxLength = maxLength;
    }

    public char getBgChar() {
        return mBgChar;
    }

    public void setBgChar(char bgChar) {
        mBgChar = bgChar;
    }

    public List<Layer> getLayers() {
        return mLayers;
    }

    public void setLayers(List<Layer> layers) {
        mLayers = layers;
    }
}
