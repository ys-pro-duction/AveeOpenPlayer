package com.daaw;

/* JADX INFO: renamed from: com.daaw.jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5650jM implements InterfaceC5370iM {
    public final String a;
    public final int b;

    public C5650jM(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC5370iM
    public long a() {
        if (this.b == 0) {
            return 0L;
        }
        String strE = e();
        try {
            return Long.valueOf(strE).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strE, "long"), e);
        }
    }

    @Override // com.daaw.InterfaceC5370iM
    public double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strE = e();
        try {
            return Double.valueOf(strE).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strE, "double"), e);
        }
    }

    @Override // com.daaw.InterfaceC5370iM
    public String c() {
        if (this.b == 0) {
            return "";
        }
        f();
        return this.a;
    }

    @Override // com.daaw.InterfaceC5370iM
    public boolean d() {
        if (this.b == 0) {
            return false;
        }
        String strE = e();
        if (C7748qq.f.matcher(strE).matches()) {
            return true;
        }
        if (C7748qq.g.matcher(strE).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strE, "boolean"));
    }

    public final String e() {
        return c().trim();
    }

    public final void f() {
        if (this.a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}
