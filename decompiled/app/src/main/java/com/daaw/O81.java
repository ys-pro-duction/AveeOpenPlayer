package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class O81 extends C4027db {
    public final I80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O81(List list, I80 i80) {
        super(list, new N81(i80));
        G10.g(list, "value");
        G10.g(i80, "type");
        this.c = i80;
    }

    public static final I80 c(I80 i80, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(i80, "$type");
        G10.g(interfaceC2968Zk0, "it");
        return i80;
    }

    public final I80 e() {
        return this.c;
    }
}
