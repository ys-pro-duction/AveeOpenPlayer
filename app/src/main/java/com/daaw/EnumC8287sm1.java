package com.daaw;

/* JADX INFO: renamed from: com.daaw.sm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8287sm1 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    public static final AbstractC7765qt1 R;
    public final int B;

    static {
        C1418Ks1 c1418Ks1 = new C1418Ks1();
        for (EnumC8287sm1 enumC8287sm1 : values()) {
            c1418Ks1.a(Integer.valueOf(enumC8287sm1.B), enumC8287sm1);
        }
        R = c1418Ks1.b();
    }

    EnumC8287sm1(int i) {
        this.B = i;
    }

    public static EnumC8287sm1 a(int i) {
        AbstractC7765qt1 abstractC7765qt1 = R;
        Integer numValueOf = Integer.valueOf(i);
        return !abstractC7765qt1.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC8287sm1) abstractC7765qt1.get(numValueOf);
    }
}
