/*
package etc;

public class nexon {
    */
/*
     * Complete the 'bestInGenre' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING genre as parameter.
     *
     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
     *//*


    // Write your code here
    public static String bestInGenre(String genre) {
        // Define the base URL for the TV series API
        String baseUrl = "https://jsonmock.hackerrank.com/api/tvseries?page=";

        // Initialize variables to store the best series information
        String bestSeriesName = "";
        double bestImdbRating = Double.MIN_VALUE;

        int page = 1;
        JSONParser parser = new JSONParser();

        try {
            while (true) {
                // Create the URL for the current page
                String url = baseUrl + page;

                // Open a connection to the API URL
                URLConnection connection = new URL(url).openConnection();

                // Read the data from the URL
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse the JSON response
                JSONObject jsonResponse = (JSONObject) parser.parse(response.toString());
                JSONArray seriesArray = (JSONArray) jsonResponse.get("data");

                for (Object seriesObj : seriesArray) {
                    JSONObject series = (JSONObject) seriesObj;
                    String seriesGenre = (String) series.get("genre");
                    double seriesRating = (double) series.get("imdb_rating");

                    // Check if the series matches the genre and has a higher IMDb rating
                    if (seriesGenre.contains(genre) && seriesRating > bestImdbRating) {
                        bestImdbRating = seriesRating;
                        bestSeriesName = (String) series.get("name");
                    }
                }

                // Check if there are more pages to fetch
                long total = (long) jsonResponse.get("total");
                long total_pages = (long) jsonResponse.get("total_pages");
                if (page >= total_pages) {
                    break;
                }

                page++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bestSeriesName;
    }

}

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String genre = bufferedReader.readLine();

        String result = Result.bestInGenre(genre);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
}
*/
