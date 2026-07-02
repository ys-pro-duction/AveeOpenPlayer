package com.daaw;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.daaw.tG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8425tG0 {
    public static final InterfaceC2536Vg0 c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C2640Wg0(matcher, charSequence);
        }
        return null;
    }

    public static final H00 d(MatchResult matchResult, int i) {
        return AbstractC8417tE0.q(matchResult.start(i), matchResult.end(i));
    }
}
