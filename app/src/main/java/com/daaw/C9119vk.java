package com.daaw;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: com.daaw.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9119vk implements CharacterIterator {
    public final CharSequence B;
    public final int C;
    public final int D;
    public int E;

    public C9119vk(CharSequence charSequence, int i, int i2) {
        G10.g(charSequence, "charSequence");
        this.B = charSequence;
        this.C = i;
        this.D = i2;
        this.E = i;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object objClone = super.clone();
            G10.f(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.E;
        if (i == this.D) {
            return (char) 65535;
        }
        return this.B.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.E = this.C;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.C;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.D;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.E;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.C;
        int i2 = this.D;
        if (i == i2) {
            this.E = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.E = i3;
        return this.B.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.E + 1;
        this.E = i;
        int i2 = this.D;
        if (i < i2) {
            return this.B.charAt(i);
        }
        this.E = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.E;
        if (i <= this.C) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.E = i2;
        return this.B.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.C;
        if (i > this.D || i2 > i) {
            throw new IllegalArgumentException("invalid position");
        }
        this.E = i;
        return current();
    }
}
