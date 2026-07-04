package com.google.ads;

import android.content.Context;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public final com.google.android.gms.ads.AdSize a;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2);
    public static final AdSize BANNER = new AdSize(320, 50);
    public static final AdSize IAB_MRECT = new AdSize(RCHTTPStatusCodes.UNSUCCESSFUL, 250);
    public static final AdSize IAB_BANNER = new AdSize(468, 60);
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90);
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600);

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.a = adSize;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AdSize) {
            return this.a.equals(((AdSize) obj).a);
        }
        return false;
    }

    public AdSize findBestSize(AdSize... adSizeArr) {
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        float f = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (r6 * r7) / (width * height);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public int getHeightInPixels(Context context) {
        return this.a.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public int getWidthInPixels(Context context) {
        return this.a.getWidthInPixels(context);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAutoHeight() {
        return this.a.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.a.isFullWidth();
    }

    public boolean isSizeAppropriate(int i, int i2) {
        float width = getWidth();
        float f = i;
        float f2 = width * 1.25f;
        int height = getHeight();
        if (f > f2 || f < width * 0.8f) {
            return false;
        }
        float f3 = i2;
        float f4 = height;
        return f3 <= 1.25f * f4 && f3 >= f4 * 0.8f;
    }

    public String toString() {
        return this.a.toString();
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }
}
