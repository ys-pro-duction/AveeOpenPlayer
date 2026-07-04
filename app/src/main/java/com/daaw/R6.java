package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class R6 implements X6 {
    public final I6 a;
    public final I6 b;

    public R6(I6 i6, I6 i62) {
        this.a = i6;
        this.b = i62;
    }

    @Override // com.daaw.X6
    public boolean g() {
        return this.a.g() && this.b.g();
    }

    @Override // com.daaw.X6
    public AbstractC9089ve h() {
        return new C9050vV0(this.a.h(), this.b.h());
    }

    @Override // com.daaw.X6
    public List i() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
