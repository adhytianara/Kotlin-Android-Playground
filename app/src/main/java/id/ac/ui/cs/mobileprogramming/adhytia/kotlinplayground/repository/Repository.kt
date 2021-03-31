package bangkit.adhytia.github_user.repository

import bangkit.adhytia.github_user.api.RetrofitInstance
import bangkit.adhytia.github_user.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}