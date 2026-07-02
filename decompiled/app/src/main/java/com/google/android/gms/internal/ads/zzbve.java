package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7656qX;
import com.daaw.AbstractC9322wT1;
import com.daaw.FP1;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbve;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbve extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbve> CREATOR = new FP1();
    public ParcelFileDescriptor B;
    public Parcelable C = null;
    public boolean D = true;

    public zzbve(ParcelFileDescriptor parcelFileDescriptor) {
        this.B = parcelFileDescriptor;
    }

    public final SafeParcelable e(Parcelable.Creator creator) {
        if (this.D) {
            if (this.B == null) {
                AbstractC4274eT1.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.B));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    AbstractC7656qX.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.C = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.D = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    AbstractC4274eT1.zzh("Could not read from parcel file descriptor", e);
                    AbstractC7656qX.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                AbstractC7656qX.a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.B == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.C.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.EP1
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<zzbve> creator = zzbve.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            AbstractC7656qX.a(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            AbstractC4274eT1.zzh("Error transporting the ad response", e);
                                            zzt.zzo().u(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                AbstractC7656qX.a(outputStream);
                                            } else {
                                                AbstractC7656qX.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                AbstractC7656qX.a(outputStream);
                                            } else {
                                                AbstractC7656qX.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        AbstractC4274eT1.zzh("Error transporting the ad response", e);
                        zzt.zzo().u(e, "LargeParcelTeleporter.pipeData.2");
                        AbstractC7656qX.a(autoCloseOutputStream);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.B = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iA = JM0.a(parcel);
        JM0.p(parcel, 2, this.B, i, false);
        JM0.b(parcel, iA);
    }
}
