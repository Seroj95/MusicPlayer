package com.seroj.musicplayer.fragments

import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import com.seroj.musicplayer.R
import com.seroj.musicplayer.databinding.FragmentListMusicBinding
import com.seroj.musicplayer.helper.Constants
import com.seroj.musicplayer.helper.Constants.toast
import com.seroj.musicplayer.models.Song
import java.util.ArrayList


class ListMusicFragment : Fragment(R.layout.fragment_list_music) {

    private var _binding: FragmentListMusicBinding? = null
    private val binding get() = _binding!!
    private var songList: MutableList<Song> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListMusicBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkUserPermision()
    }

    //load song
    private fun loadSongs() {
        val allSongURI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        val selection = MediaStore.Audio.Media.IS_MUSIC + "!=0"
        val sortOrder = "${MediaStore.Audio.Media.DISPLAY_NAME} ASC"
        val coursor = activity?.applicationContext?.contentResolver!!.query(
            allSongURI, null, selection, null,
            sortOrder
        )
        if (coursor != null) {
            while (coursor != null) {
                while (coursor.moveToNext()) {
                    val songUri =
                        coursor.getString(coursor.getColumnIndex(MediaStore.Audio.Media.DATA))
                    val songAuthor =
                        coursor.getString(coursor.getColumnIndex(MediaStore.Audio.Media.ARTIST))
                    val songTitle =
                        coursor.getString(coursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME))
                    val songDuration =
                        coursor.getString(coursor.getColumnIndex(MediaStore.Audio.Media.DURATION))
                    //let is convert the song douration
                    val songDourLong = songDuration.toLong()
                    songList.add(
                        Song(
                            songTitle,
                            songAuthor,
                            songUri,
                            Constants.durationConverter(songDourLong)
                        )
                    )
                }
                coursor.close()
            }
        }
    }

    private fun checkUserPermision() {
        if (activity?.let {
                ActivityCompat.checkSelfPermission(
                    it, android.Manifest.permission.READ_EXTERNAL_STORAGE
                )

            } != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(
                arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                Constants.REQUEST_CODE_FOR_PERMISIONS
            )
            return
        }
        activity?.toast("Grandent")
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            Constants.REQUEST_CODE_FOR_PERMISIONS ->
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    activity?.toast("Permision Grandet")
                    loadSongs()
                } else {
                    activity?.toast("Permision Denited")
                }
            else -> {
                super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}