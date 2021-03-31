package bangkit.adhytia.github_user.api

import bangkit.adhytia.github_user.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/3")
    suspend fun getPost(): Response<Post>
}