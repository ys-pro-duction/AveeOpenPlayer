package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class O93 extends AbstractC6556ma3 {
    public O93(U93 u93, String str, Double d, boolean z) {
        super(u93, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.daaw.AbstractC6556ma3
    public final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
