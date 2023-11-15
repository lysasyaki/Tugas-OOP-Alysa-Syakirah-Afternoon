package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var firstname: String = "alysa"
    var lastname: String = "syakirah"
    var umur: Byte = 19
    var Single : Boolean = true

    println("Nama saya $firstname $lastname dan saat ini umur saya $umur tahun")
    println("Status single saat ini : $Single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "Group Id : $groupId \n Group Member : $groupMember \n Session : $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    var group = listOf("Alysa Syakirah, Gina Salsabila, Dariwan, Ahmad Maulana, Syakuqillah Hadie Ahsa")
    return listOf(group)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): String {
    val mentor = arrayOf<String>("Kak Kelvin","Kak Iffan","Kak Shania")
    val countOfGroup = arrayOf<String>("Alysa Syakirah","Gina Salsabila", "Dariwan", "Ahmad Maulana", "Syaqillah Hadie Ahsa")
    val count = "${mentor.size + countOfGroup.size}"
    return "$count"
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("11:11", listOf("Alysa Syakirah","Gina Salsabila", "Dariwan", "Ahmad Maulana", "Syaqillah Hadie Ahsa"), "Afternoon")
}