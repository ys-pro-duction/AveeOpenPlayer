package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class ZJ {
    public C7489pu a;
    public final EnumC8325su b;
    public VJ c;
    public boolean d;

    public ZJ(C7489pu c7489pu, EnumC8325su enumC8325su) {
        this.a = (C7489pu) AbstractC6948ny0.c(c7489pu, "ParserBuilder must not be null");
        this.b = (EnumC8325su) AbstractC6948ny0.c(enumC8325su, "CronFieldName must not be null");
        this.c = VJ.i().h(enumC8325su);
    }

    public C7489pu a() {
        this.a.g(new YJ(this.b, this.c.f(), this.d));
        return this.a;
    }

    public ZJ b() {
        this.d = true;
        return this;
    }

    public ZJ c(int i, int i2) {
        this.c.k(i, i2);
        return this;
    }

    public ZJ d() {
        this.c.m();
        return this;
    }

    public ZJ e(int i, int i2) {
        this.c.n(i, i2);
        return this;
    }
}
