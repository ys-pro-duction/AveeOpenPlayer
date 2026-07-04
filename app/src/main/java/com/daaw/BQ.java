package com.daaw;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public class BQ {
    public static float[] k = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static float[] l = {0.5f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f};
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final ShortBuffer d;
    public int e;
    public int f;
    public int g;
    public final short[] h;
    public int j;
    public C6102kw a = new C6102kw();
    public final int i = 12;

    public BQ() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.h = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(k.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(k);
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(l.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.c = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(l);
        floatBufferAsFloatBuffer2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
        this.d = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        this.f = VT.s(35633, "const vec2 madd=vec2(0.5,0.5);attribute vec3 vertexIn;varying vec2 textureCoord;void main() {textureCoord = vertexIn.xy*madd+madd;gl_Position = vec4(vertexIn,1.0);}");
        this.g = VT.s(35632, "precision mediump float;varying vec2 textureCoord;uniform sampler2D s_texture;void main() {vec4 color1 = texture2D(s_texture,textureCoord);gl_FragColor = color1;}");
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.e = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, this.f);
        GLES20.glAttachShader(this.e, this.g);
        GLES20.glLinkProgram(this.e);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.e, 35714, iArr, 0);
        if (iArr[0] != 1) {
            AbstractC0441Bk1.c("Could not link program: ");
            AbstractC0441Bk1.c(GLES20.glGetProgramInfoLog(this.e));
            GLES20.glDeleteProgram(this.e);
        }
    }

    public void b() {
        if (this.e != 0) {
            c();
            GLES20.glDeleteProgram(this.e);
            this.e = 0;
        }
    }

    public final void c() {
        int i = this.f;
        if (i != 0) {
            GLES20.glDetachShader(this.e, i);
            GLES20.glDeleteShader(this.f);
            this.f = 0;
        }
        int i2 = this.g;
        if (i2 != 0) {
            GLES20.glDetachShader(this.e, i2);
            GLES20.glDeleteShader(this.g);
            this.g = 0;
        }
    }

    public void d() {
        GLES20.glUseProgram(this.e);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.e, "vertexIn");
        this.j = iGlGetAttribLocation;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(this.j, 3, 5126, false, 12, (Buffer) this.b);
        GLES20.glDrawElements(4, this.h.length, 5123, this.d);
        GLES20.glDisableVertexAttribArray(this.j);
    }

    public void e(AbstractC3987dR0 abstractC3987dR0, String str) {
        int i = abstractC3987dR0.i(str);
        GLES20.glEnableVertexAttribArray(i);
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, (Buffer) this.b);
        GLES20.glDrawElements(4, this.h.length, 5123, this.d);
        GLES20.glDisableVertexAttribArray(i);
    }

    public final /* synthetic */ Boolean f() {
        return Boolean.valueOf(this.e == 0);
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.a.a(new KQ() { // from class: com.daaw.AQ
            @Override // com.daaw.KQ
            public final Object a() {
                return this.a.f();
            }
        });
    }
}
