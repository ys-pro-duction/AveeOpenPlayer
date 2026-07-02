package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9677xk extends S00 {
    public C9677xk(char c) {
        super(Character.valueOf(c));
    }

    public final String c(char c) {
        return c == '\b' ? "\\b" : c == '\t' ? "\\t" : c == '\n' ? "\\n" : c == '\f' ? "\\f" : c == '\r' ? "\\r" : e(c) ? String.valueOf(c) : "?";
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public YS0 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0U = interfaceC2968Zk0.p().u();
        G10.f(ys0U, "getCharType(...)");
        return ys0U;
    }

    public final boolean e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        G10.f(str, "format(...)");
        return str;
    }
}
