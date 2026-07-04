package com.daaw;

import android.graphics.Shader;

/* JADX INFO: renamed from: com.daaw.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2223Sg {

    /* JADX INFO: renamed from: com.daaw.Sg$a */
    public static final class a extends SQ0 {
        public final /* synthetic */ Shader e;

        public a(Shader shader) {
            this.e = shader;
        }

        @Override // com.daaw.SQ0
        public Shader b(long j) {
            return this.e;
        }
    }

    public static final SQ0 a(Shader shader) {
        G10.g(shader, "shader");
        return new a(shader);
    }
}
