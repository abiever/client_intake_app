package cherry.company.client_intake_app

import androidx.compose.runtime.snapshots.SnapshotStateList

class Client(
    private var firstName: String,
    private var lastName: String,
    private var birthDate: String,
    private var initialPain: String, //or should this be Int?
//    private var initialHealthIssues: MutableList<Boolean>
) {
    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getBirthDate(): String {
        return birthDate
    }

    fun getInitialPain(): String {
        return initialPain
    }
}