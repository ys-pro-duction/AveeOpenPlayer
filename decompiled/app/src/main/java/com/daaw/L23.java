package com.daaw;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class L23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
