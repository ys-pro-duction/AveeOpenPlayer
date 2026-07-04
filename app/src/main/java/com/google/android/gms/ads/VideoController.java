package com.google.android.gms.ads;

import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;

/* JADX INFO: loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    public final Object a = new Object();
    public zzdq b;
    public VideoLifecycleCallbacks c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar == null) {
                return 0;
            }
            try {
                return zzdqVar.zzh();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.a) {
            videoLifecycleCallbacks = this.c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.a) {
            z = this.b != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzo();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzp();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar == null) {
                return true;
            }
            try {
                return zzdqVar.zzq();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzj(z);
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzk();
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzl();
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfk zzfkVar;
        synchronized (this.a) {
            this.c = videoLifecycleCallbacks;
            zzdq zzdqVar = this.b;
            if (zzdqVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfkVar = null;
                } else {
                    try {
                        zzfkVar = new zzfk(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                    }
                }
                zzdqVar.zzm(zzfkVar);
            }
        }
    }

    public void stop() {
        synchronized (this.a) {
            zzdq zzdqVar = this.b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzn();
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final zzdq zza() {
        zzdq zzdqVar;
        synchronized (this.a) {
            zzdqVar = this.b;
        }
        return zzdqVar;
    }

    public final void zzb(zzdq zzdqVar) {
        synchronized (this.a) {
            try {
                this.b = zzdqVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.c;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
