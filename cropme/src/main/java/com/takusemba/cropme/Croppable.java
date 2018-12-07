package com.takusemba.cropme;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

/**
 * Croppable
 **/
interface Croppable {

    /**
     * setUri to {@link ImageView}
     **/
    void setUri(Uri uri);

    /**
     * setBitmap to {@link ImageView}
     **/
    void setBitmap(Bitmap bitmap);

    /**
     * crop image. fails if image is outside of {@link CropOverlay#getFrame()}
     **/
    void crop(OnCropListener listener);
}
