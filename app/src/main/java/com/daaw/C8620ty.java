package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8620ty {
    public static final C8620ty b = new C8620ty();
    public HashMap a;

    public C8620ty() {
        HashMap map = new HashMap();
        this.a = map;
        map.put("anim128_g_m10_15", Integer.valueOf(AbstractC3374bD0.a));
        this.a.put("particle_blur01", Integer.valueOf(AbstractC3374bD0.j0));
        this.a.put("particle_circle_blur4", Integer.valueOf(AbstractC3374bD0.m0));
        this.a.put("particle_circle_w_a_64", Integer.valueOf(AbstractC3374bD0.n0));
        this.a.put("placeholderart5", Integer.valueOf(AbstractC3374bD0.r0));
        this.a.put("vignette80", Integer.valueOf(AbstractC3374bD0.C0));
        this.a.put("transparent", Integer.valueOf(AbstractC3374bD0.B0));
        this.a.put("white", Integer.valueOf(AbstractC3374bD0.D0));
        this.a.put("black", Integer.valueOf(AbstractC3374bD0.b));
        this.a.put("rainbow128", Integer.valueOf(AbstractC3374bD0.t0));
        this.a.put("particle_blur01_more", Integer.valueOf(AbstractC3374bD0.l0));
        this.a.put("lens_flare", Integer.valueOf(AbstractC3374bD0.g0));
        this.a.put("lens_flare_2", Integer.valueOf(AbstractC3374bD0.f0));
        this.a.put("particle_sharp", Integer.valueOf(AbstractC3374bD0.o0));
        this.a.put("particle_blur_inv", Integer.valueOf(AbstractC3374bD0.k0));
        this.a.put("year2017", Integer.valueOf(AbstractC3374bD0.E0));
        this.a.put("year2018", Integer.valueOf(AbstractC3374bD0.F0));
        this.a.put("snowflake", Integer.valueOf(AbstractC3374bD0.x0));
    }

    public static C8620ty b() {
        return b;
    }

    public int a(String str, int i) {
        Integer num = (Integer) this.a.get(str);
        return num == null ? i : num.intValue();
    }
}
