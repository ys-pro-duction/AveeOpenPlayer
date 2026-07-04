package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class AS {
    public final KI0 a;
    public final KI0 b;

    public AS(KI0 ki0, KI0 ki02) {
        if (ki0 != null && ki02 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (ki0 == null && ki02 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.b = ki0;
        this.a = ki02;
    }

    public KI0 a() {
        return this.b;
    }

    public KI0 b() {
        return this.a;
    }

    public int c() {
        KI0 ki0 = this.b;
        return ki0 != null ? ki0.a() : this.a.a();
    }
}
