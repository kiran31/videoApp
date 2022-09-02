package in.binplus.exclusivevideoapp.Model;

public class DrawerModel {
    String title;
    int imageId;
    boolean isChecked;

    public DrawerModel(String title, int imageId, boolean isChecked) {
        this.title = title;
        this.imageId = imageId;
        this.isChecked = isChecked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
