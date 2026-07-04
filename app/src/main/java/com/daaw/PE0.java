package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PE0 implements InterfaceC6094ku {
    public final C7210ou B;

    public PE0(C7210ou c7210ou) {
        this.B = (C7210ou) AbstractC6948ny0.c(c7210ou, "CronDefinition must not be null");
    }

    @Override // com.daaw.InterfaceC6094ku
    public Map m() {
        return DesugarCollections.unmodifiableMap(new HashMap());
    }

    @Override // com.daaw.InterfaceC6094ku
    public C8046ru p(EnumC8325su enumC8325su) {
        AbstractC6948ny0.c(enumC8325su, "CronFieldName must not be null");
        return null;
    }

    @Override // com.daaw.InterfaceC6094ku
    public C7210ou v() {
        return this.B;
    }
}
