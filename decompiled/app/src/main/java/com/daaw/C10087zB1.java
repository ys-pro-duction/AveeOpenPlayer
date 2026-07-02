package com.daaw;

/* JADX INFO: renamed from: com.daaw.zB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10087zB1 implements InterfaceC6701n43 {
    public static final InterfaceC6701n43 a = new C10087zB1();

    @Override // com.daaw.InterfaceC6701n43
    public final boolean c(int i) {
        AB1 ab1;
        AB1 ab12 = AB1.AD_INITIATER_UNSPECIFIED;
        switch (i) {
            case 0:
                ab1 = AB1.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                ab1 = AB1.BANNER;
                break;
            case 2:
                ab1 = AB1.DFP_BANNER;
                break;
            case 3:
                ab1 = AB1.INTERSTITIAL;
                break;
            case 4:
                ab1 = AB1.DFP_INTERSTITIAL;
                break;
            case 5:
                ab1 = AB1.NATIVE_EXPRESS;
                break;
            case 6:
                ab1 = AB1.AD_LOADER;
                break;
            case 7:
                ab1 = AB1.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                ab1 = AB1.BANNER_SEARCH_ADS;
                break;
            case 9:
                ab1 = AB1.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                ab1 = AB1.APP_OPEN;
                break;
            case 11:
                ab1 = AB1.REWARDED_INTERSTITIAL;
                break;
            default:
                ab1 = null;
                break;
        }
        return ab1 != null;
    }
}
