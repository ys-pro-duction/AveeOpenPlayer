package com.daaw;

import com.daaw.O7;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TG implements O7 {
    public static final TG a = new TG();

    public final Void a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // com.daaw.O7
    public AP d() {
        return O7.a.a(this);
    }

    @Override // com.daaw.O7
    public I80 getType() {
        a();
        throw null;
    }

    @Override // com.daaw.O7
    public RU0 j() {
        a();
        throw null;
    }

    @Override // com.daaw.O7
    public Map k() {
        a();
        throw null;
    }

    public String toString() {
        return "[EnhancedType]";
    }
}
