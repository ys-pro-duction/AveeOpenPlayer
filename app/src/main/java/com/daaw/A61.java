package com.daaw;

import android.text.style.TtsSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class A61 {
    public static final TtsSpan a(AbstractC10063z61 abstractC10063z61) {
        G10.g(abstractC10063z61, "<this>");
        if (abstractC10063z61 instanceof C9086vd1) {
            return b((C9086vd1) abstractC10063z61);
        }
        throw new C6902no0();
    }

    public static final TtsSpan b(C9086vd1 c9086vd1) {
        G10.g(c9086vd1, "<this>");
        TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(c9086vd1.a()).build();
        G10.f(ttsSpanBuild, "builder.build()");
        return ttsSpanBuild;
    }
}
