package com.daaw;

/* JADX INFO: renamed from: com.daaw.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1871Pc extends GH {
    public final Integer a;
    public final Object b;
    public final EnumC8911uz0 c;

    public C1871Pc(Integer num, Object obj, EnumC8911uz0 enumC8911uz0) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (enumC8911uz0 == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = enumC8911uz0;
    }

    @Override // com.daaw.GH
    public Integer a() {
        return this.a;
    }

    @Override // com.daaw.GH
    public Object b() {
        return this.b;
    }

    @Override // com.daaw.GH
    public EnumC8911uz0 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GH) {
            GH gh = (GH) obj;
            Integer num = this.a;
            if (num != null ? num.equals(gh.a()) : gh.a() == null) {
                if (this.b.equals(gh.b()) && this.c.equals(gh.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
