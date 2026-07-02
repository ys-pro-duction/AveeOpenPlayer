package com.daaw;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.daaw.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3753cc {
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: com.daaw.cc$a */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public C3753cc(AudioTrack audioTrack) {
        if (AbstractC6280lb1.a >= 19) {
            this.a = new a(audioTrack);
            h();
        } else {
            this.a = null;
            i(3);
        }
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public boolean e() {
        return this.b == 2;
    }

    public boolean f(long j) {
        a aVar = this.a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean zC = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        h();
                        return zC;
                    }
                } else if (!zC) {
                    h();
                    return zC;
                }
            } else {
                if (!zC) {
                    h();
                    return zC;
                }
                if (this.a.a() > this.f) {
                    i(2);
                    return zC;
                }
            }
        } else {
            if (zC) {
                if (this.a.b() < this.c) {
                    return false;
                }
                this.f = this.a.a();
                i(1);
                return zC;
            }
            if (j - this.c > 500000) {
                i(3);
            }
        }
        return zC;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }

    public final void i(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 5000L;
            return;
        }
        if (i == 1) {
            this.d = 5000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
