package com.example.agentvalorant

object AgentData {
    private val agentNames = arrayOf("Jett",
        "Raze",
        "Breach",
        "Omen",
        "Brimstone",
        "Phoenix",
        "Sage",
        "Sova",
        "Viper",
        "Cypher",
        "Reyna")
    private val agentRoles = arrayOf("Duelist",
        "Duelist",
        "Initiatior",
        "Controller",
        "Controller",
        "Duelist",
        "Sentinel",
        "Initiatior",
        "Controller",
        "Sentinel",
        "Duelist")

    private val agentPenjelasan = arrayOf("Enggak bisa dimungkiri, Jett adalah karakter yang jadi sampul dari game Valorant. Sebagai Agent gratis yang bisa direkrut, Jett merupakan Duelist yang layak dipilih di setiap kesempatan. Selain bisa menggunakan alat bantu untuk zoning dari kemampuan Cloudburst miliknya, Ketika Ultimate miliknya, Blade Storm aktif, Agent asal Korea ini bisa menghabisi banyak musuh jika digunakan dengan efektif.",
        "Meski bergelar Duelist, Raze merupakan karakter Agent yang cukup bertumpu pada skill miliknya. Kemampuan Boom Bot miliknya bisa digunakan untuk melakukan scout dan mencari musuh di lorong-lorong panjang. Ultimate miliknya juga sangat berguna untuk membunuh musuh dengan sadis berkat Rocket Launcher yang punya damage sangat besar.",
        "Seperti namanya, Breach sangat dibutuhkan oleh tim untuk mendobrak pertahanan musuh. Kemampuan karakter keturunan Viking ini bisa menembus tembok dan sangat berguna untuk mengalahkan musuh yang bersembunyi. Meski terlihat tanky, Breach juga tetap rapuh karena sekali lagi, game ini bukan Overwatch!",
        "Membawa nuansa warna ungu dan hitam, Omen jadi Agent paling gelap di Valorant. Uniknya, Omen bukanlah karakter yang mampu memberikan damage besar. Sebagai Controller, Omen bisa menggelapkan wilayah dan juga melakukan teleportasi dengan Ultimate miliknya. Omen jadi karakter wajib dipakai bila kalian seorang Entry Fragger atau Support.",
        "Sebagai mantan veteran perang, Brimstone adalah karakter yang punya banyak utility untuk dipergunakan di dalam pertandingan. Mulai dari menutup vision hingga memanggil Orbital Strike, Brimstone menjadi karakter Support yang sangat ramah bagi para pemula.",
        "Seperti namanya, Phoenix sangat lekat dengan elemen api. Dia bisa mengeluarkan kemampuan serupa geranat maupun tembok membara yang bisa melukai musuh yang melewatinya. Baik sebagai Attacker atau Defender, Phoenix jadi Duelist yang cukup mudah untuk dikuasai permainannya.",
        "Seperti kehadiran Mercy di Overwatch, Sage merupakan karakter yang bisa melakukan Heal hingga menghidupkan kembali anggota tim. Sebagai Support, Sage bahkan bisa menciptakan tembok untuk menghalangi entry dari musuh maupun mempertahankan Bomb Site. Sebagai karakter gratis, Sage jadi pilihan wajib di setiap permainan.",
        "Karakter yang kita pakai di mode tutorial ini merupakan pemanah yang sangat berguna. Sova bisa memanggil drone hingga menembak Recon untuk mengetahui posisi musuh. Jika Ultimate-nya telah bangkit, Sova bahkan bisa mengeliminasi musuh dengan panah berkekuatan listrik miliknya.",
        "Identik dengan warna hijau, Viper merupakan wanita beracun yang sangat berbahaya. Kemampuan miliknya punya efek korosif dan karenanya, kalian enggak akan mau terjebak di lingkaran racun yang dia keluarkan. Jadi karakter tambahan di perilisan, sayangnya karakter ini tampil underrated lantaran damage-nya bisa dibilang kurang besar dibanding Agents lain.",
        "Meski enggak bisa melakukan healing seperti Sage, nyatanya Cypher sangat berguna untuk melakukan zoning. Trapwire miliknya sangat bisa digunakan untuk menjebak musuh yang ingin melewati lorong. Selain itu, Cypher bisa mengeluarkan Spycam serupa CCTV yang bisa digunakan untuk mengintip posisi lawan.",
        "Bagi kalian yang doyan barbar, Reyna merupakan Agent yang sangat cocok. Setiap melakukan kill, Reyna bisa mengumpulkan Soul Orb untuk melakukan healing. Jika dipakai oleh pemain berbakat, Reyna bisa melakukan Ace dengan mudah lantaran dirinya bakal pulih seperti semula setiap melakukan kill.")

    private val agentImages = intArrayOf(R.drawable.jett,
        R.drawable.raze,
        R.drawable.breach,
        R.drawable.omen,
        R.drawable.brimstone,
        R.drawable.phoenix,
        R.drawable.sage,
        R.drawable.sova,
        R.drawable.viper,
        R.drawable.cypher,
        R.drawable.reyna)

    val listData: ArrayList<Agent>
        get() {
            val list = arrayListOf<Agent>()
            for (position in agentNames.indices) {
                val hero = Agent()
                hero.name = agentNames[position]
                hero.role = agentRoles[position]
                hero.penjelasan = agentPenjelasan[position]
                hero.photo = agentImages[position]
                list.add(hero)
            }
            return list
        }
}

