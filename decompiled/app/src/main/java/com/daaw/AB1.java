package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public enum AB1 implements InterfaceC6143l43 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    public static final InterfaceC6422m43 O = new InterfaceC6422m43() { // from class: com.daaw.yB1
    };
    public final int B;

    AB1(int i) {
        this.B = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.B);
    }

    public final int zza() {
        return this.B;
    }
}
