package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class I93 extends AbstractC6556ma3 {
    public I93(U93 u93, String str, Long l, boolean z) {
        super(u93, str, l, true, null);
    }

    @Override // com.daaw.AbstractC6556ma3
    public final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
